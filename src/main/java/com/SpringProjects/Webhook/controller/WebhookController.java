package com.SpringProjects.Webhook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
//Now i Wnt the WebHook to be Triggered man at any how i have to check this at any how by the way! !
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
