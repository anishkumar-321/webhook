package com.SpringProjects.Webhook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping
    public String handleGitHubWebHook(@RequestBody String payload,
                                      @RequestHeader(value = "X-GitHub-Event", required = false)String eventType){

        if("push".equalsIgnoreCase(eventType)){
            System.out.println("Push event received!");
            System.out.println("Payload: " + payload);
            return "Push event processed successfully!";
        }
        return "Event not handled man!";
    }
}