package ru.step.smartcontrol.template.execution.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "${templateFeignClient}", url = "${templateFeignClient.url}")
public interface TemplateFeignClient {

    @GetMapping(value = "/{templateId}/template-elements")
    public ResponseEntity<?> getAllTemplateElementsByTemplateId(
            @RequestHeader("keycloakId") String keycloakId,
            @PathVariable("templateId") Long templateId);
}
