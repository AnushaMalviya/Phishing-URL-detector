package com.example.phishing_url_detector;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PhishingController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/detect")
    public String detectPhishing(@RequestParam("url") String url, Model model) {
        boolean isPhishing = isPhishingUrl(url);
        model.addAttribute("url", url);
        model.addAttribute("isPhishing", isPhishing);
        return "result";
    }

    private boolean isPhishingUrl(String url) {

        if (url.matches(".*\\b(\\d{1,3}\\.){3}\\d{1,3}\\b.*")) return true;
        if (url.contains("@")) return true;
        String[] badWords = {"login", "verify", "secure", "account", "update", "confirm"};
        for (String word : badWords) {
            if (url.toLowerCase().contains(word)) return true;
        }
        if (url.split("\\.").length > 5) return true;
        if (url.length() > 100) return true;

        return false;
    }
}
