package com.example.demo

import brave.Tracer
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests(
	@Autowired
	private val tracer: Tracer
) {

	@Test
	fun contextLoads() {
		println(tracer.currentSpan().context().spanId())
	}

}
