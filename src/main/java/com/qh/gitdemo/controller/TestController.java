package com.qh.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1. revert commit -> 撤销提交，不删除历史提交，而是创建一个新的提交（Revert "..."）
 * 2. reset commit -> 删除提交
 *      soft：删除提交，保留修改且保留暂存区
 *      mixed：删除提交，保留修改但不保留暂存区，需重新 add
 *      hard：删除提交，不保留修改（代码丢失）
 * 3. undo commit -> 删除最新的一次提交，等同于 reset --soft
 * 4. cherry pick -> 将其他分支的提交提取到当前分支
 * update project 两种方式：
 *      1. merge方式，该方式会将远程提交和本地提交混为一个新的提交（Merge ... 出现分叉）
 *      2. rebase方式，插入远程提交在本地提交前，然后将本地提交改为合并后的版本（不会产生新的提交，不分叉，推荐）
 * 本地不 pull 就 commit，那么会 push 失败，要求先更新，可以选择 merge 或 rebase
 * 本地不 pull 就 commit，此时再 pull 会 merge
 *
 * @author maqiangfei
 * @since 2025/4/20 13:51
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hi4RemoteChange")
    public String hi() {
        return "hi4RemoteChange";
    }

    @GetMapping("/v2")
    public String v2() {
        return "v2";
    }

    @GetMapping("/remoteAdd")
    public String remoteAdd() {
        return "remoteAdd";
    }

    @GetMapping("/remoteAddAndLocalChange")
    public String remoteAddAndLocalChange() {
        return "remoteAddAndLocalChange";
    }

    // 远程仓库改变后本地不拉取就commit，那么当本地push时会失败，要求先合并
    // update project 两种方式：
    // 1. merge方式，该方式会将远程提交和本地提交混为一个新的提交（出现分叉）
    // 2. rebase方式，插入远程提交在本地提交前，然后将本地提交改为合并后的版本（未分叉，推荐）
    @GetMapping("remoteChangeAndLocalCommitPush")
    public String remoteChangeAndLocalCommitPush() {
        return "remoteChangeAndLocalCommitPush";
    }
    @GetMapping("/localNewCommitAndPush")
    public String localNewCommitAndPush() {
        return "localNewCommitAndPush";
    }

    // 本地未拉取远程最新代码并且commit了，那么当本地拉取时可能会要求合并
    @GetMapping("/remoteAddAndLocalCommit")
    public String remoteAddAndLocalCommit() {
        return "remoteAddAndLocalCommit";
    }
    @GetMapping("/localNewCommit")
    public String localNewCommit() {
        return "localNewCommit";
    }

    @GetMapping("/localNewCommit2")
    public String localNewCommit2() {
        return "localNewCommit2";
    }

    @GetMapping("/remoteCommit")
    public String remoteCommit() {
        return "remoteCommit";
    }

    @GetMapping("/remoteCommit1")
    public String remoteCommit1() {
        return "remoteCommit1";
    }

    @GetMapping("/localNewCommit3")
    public String localNewCommit3() {
        return "localNewCommit3";
    }

    @GetMapping("/remoteCommit2")
    public String remoteCommit2() {
        return "remoteCommit2";
    }

    // 本地未拉取commit后再拉取，会marge
    @GetMapping("/localNewCommit4")
    public String localNewCommit4() {
        return "localNewCommit4";
    }
}
