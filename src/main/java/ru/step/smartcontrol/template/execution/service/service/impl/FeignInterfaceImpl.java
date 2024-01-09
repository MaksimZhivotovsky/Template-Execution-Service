package ru.step.smartcontrol.template.execution.service.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.step.smartcontrol.template.execution.service.client.BookFeignClient;
import ru.step.smartcontrol.template.execution.service.service.FeignInterface;
import ru.step.smartcontrol.template.execution.service.client.LibraryFeignClient;


@RequiredArgsConstructor
@Service
public class FeignInterfaceImpl implements FeignInterface {

    private final BookFeignClient bookFeignClient;
    private final LibraryFeignClient libraryFeignClient;

    @Override
    @Transactional
    public Object realize(String keycloakId, Object object) {
//        for (TemplateElement te : object.getTemplateElements()) {
//
////            Выбор сервиса для выполнения
//            if (te.getServiceId().toString().equals("123e4567-e89b-12d3-a456-556642440000")) {
//                bookFeignClient.createObject(keycloakId, ParseJson.parse(realizeTemplate(te)));
//            }
////            Выбор сервиса для выполнения
//            if (te.getServiceId().toString().equals("123e4567-e89b-12d3-a456-556642440001")) {
//                libraryFeignClient.createObject(keycloakId, ParseJson.parse(realizeTemplate(te)));
//            }
//        }

        return null;
    }

//    private String realizeTemplate(Object te) {
//
////       Собираю все RelationField которые есть в Params
//        List<String> relationFieldCreateValue = te.getParams().stream()
////                .filter(tep -> tep.getIsCreate().equals(true))
//                .map(TemplateElementParam::getRelationField)
//                .collect(Collectors.toList());
//
////        Собираю все Parametr которые есть в Params
//        List<String> parametrCreateValue = te.getParams().stream()
////                .filter(tep -> tep.getIsCreate().equals(true))
//                .map(TemplateElementParam::getParametr)
//                .collect(Collectors.toList());
//
////         Передаю в JSON строку все изменения которые были переданы в Parametr
//        JSONObject jObject = new JSONObject(te.getCreateValue());
//        for (int i = 0; i < relationFieldCreateValue.size(); i++) {
//            jObject.put(relationFieldCreateValue.get(i), parametrCreateValue.get(i));
//        }
//
////          Если передается в Parametr массив, заменяю символы
////          из строки экранирование массива : "[  и  ]"  и  \ на : [  и  ], символ \ удаляю
//        String refactor = null;
//        if (jObject.toString().contains("\"[") && jObject.toString().contains("]\"")) {
//            refactor = jObject.toString()
//                    .replaceAll("\"\\[", "[")
//                    .replaceAll("]\"", "]")
//                    .replaceAll("\\\\", "");
//            return refactor;
//        } else {
//            return jObject.toString();
//        }
//    }
}
