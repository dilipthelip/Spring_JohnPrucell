package com.learnspring.helloworld.annotations;

import org.springframework.stereotype.Component;

@Component
public interface LogWriter {

	void write();
}
