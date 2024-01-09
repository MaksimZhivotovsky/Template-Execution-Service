package ru.step.smartcontrol.template.execution.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "${libraryFeignClient}", url = "${libraryFeignClient.url}")
public interface LibraryFeignClient {

    @PostMapping
    void createObject(
            @RequestHeader("keycloakId")  String keycloakId,
            @RequestBody Object object);
}
