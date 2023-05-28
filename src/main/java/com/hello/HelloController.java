package com.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


@GetMapping(value="/print/{id}")
	public String getData(@PathVariable("id") String x)
{
	return "Hello"+x;
}
}
