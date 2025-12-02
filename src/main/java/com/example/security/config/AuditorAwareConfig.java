package com.example.security.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class AuditorAwareConfig implements AuditorAware<UUID> {

    private final UUID systemUuid = UUID.fromString("559acaad-8075-41bc-b9c8-b7b9656e106b");

    @Override
    public Optional<UUID> getCurrentAuditor() {
        return extractUserUuid().or(() -> Optional.of(systemUuid));
    }

    private Optional<UUID> extractUserUuid() {
        return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
                .map(Authentication::getName)
                .filter(name -> !name.equals("anonymousUser"))
                .map(UUID::fromString);
    }

}
