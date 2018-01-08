package service.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.dto.EntryPointDTO;

@RestController
@RequestMapping("/")
public class EntryPointController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public EntryPointDTO entryPoint() {
        return new EntryPointDTO();
    }
}
