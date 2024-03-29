package com.klowdtv.bugtracker.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Bug Tracker J Hipster.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link tech.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {}
