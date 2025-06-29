package com.qh.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
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
    @GetMapping("remoteChangeAndLocalCommitPush")
    public String remoteChangeAndLocalCommitPush() {
        return "remoteChangeAndLocalCommitPush";
    }
    @GetMapping("/localNewCommitAndPush")
    public String localNewCommitAndPush() {
        return "localNewCommitAndPush";
    }

    // 本地未拉取远程最新代码并且commit了，那么当本地拉取时可能会要求合并
    // update project 两种方式：
    // 1. merge方式，该方式会将远程提交和本地提交混为一个提交（merge...）
    // 2. rebase方式，插入远程提交在本地提交前，然后将本地提交改为合并后的版本（可以重新命名）
    @GetMapping("/remoteAddAndLocalCommit")
    public String remoteAddAndLocalCommit() {
        return "remoteAddAndLocalCommit";
    }
    @GetMapping("/localNewCommit")
    public String localNewCommit() {
        return "localNewCommit";
    }

    @GetMapping("/localNewCommit")
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
}
