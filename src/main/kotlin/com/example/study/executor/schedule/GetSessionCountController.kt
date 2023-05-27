package com.example.study.executor.schedule

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetSessionCountController(
    private val sessionManager: SessionManager,
) {

    @GetMapping("/session-count")
    fun getSessionCount(): Int {
        return sessionManager.getSessionSize()
    }

}
