package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaTest {
	@BeforeEach
	void setUp() {
	}

	@Test
	void FiveSeconds() {
		Media media1 = new Media("nomeA",5);
		String val = media1.getDurationString();
		assertEquals("0:00:05", val);
	}

	@Test
	void FiftyFiveSeconds() {
		Media media1 = new Media("nomeA",55);
		String val = media1.getDurationString();
		assertEquals("0:00:55", val);
	}

	@Test
	void FiveMinutesFiveSeconds() {
		Media media1 = new Media("nomeA",305);
		String val = media1.getDurationString();
		assertEquals("0:05:05", val);
	}

	@Test
	void FiveMinutesFiftyFiveSeconds() {
		Media media1 = new Media("nomeA",355);
		String val = media1.getDurationString();
		assertEquals("0:05:55", val);	}

	@Test
	void FiftyFiveMinutesFiveSeconds() {
		Media media1 = new Media("nomeA",3305);
		String val = media1.getDurationString();
		assertEquals("0:55:05", val);	}

	@Test
	void FiftyFiveMinutesFiftyFiveSeconds() {
		Media media1 = new Media("nomeA",3355);
		String val = media1.getDurationString();
		assertEquals("0:55:55", val);	}

	@Test
	void OneHourFiveSeconds() {
		Media media1 = new Media("nomeA",3605);
		String val = media1.getDurationString();
		assertEquals("1:00:05", val);	}

	@Test
	void OneHourFiftyFiveSeconds() {
		Media media1 = new Media("nomeA",3655);
		String val = media1.getDurationString();
		assertEquals("1:00:55", val);	}

	@Test
	void OneHourFiveMinutesFiveSeconds() {
		Media media1 = new Media("nomeA",3905);
		String val = media1.getDurationString();
		assertEquals("1:05:05", val);	}

	@Test
	void OneHourFiveMinutesFiftyFiveSeconds() {
		Media media1 = new Media("nomeA",3955);
		String val = media1.getDurationString();
		assertEquals("1:05:55", val);	}

	@Test
	void OneHourFiftyFiveMinutesFiveSeconds() {
		Media media1 = new Media("nomeA",6905);
		String val = media1.getDurationString();
		assertEquals("1:55:05", val);	}

	@Test
	void OneHourFiftyFiveMinutesFiftyFiveSeconds() {
		Media media1 = new Media("nomeA",6955);
		String val = media1.getDurationString();
		assertEquals("1:55:55", val);	}
}
