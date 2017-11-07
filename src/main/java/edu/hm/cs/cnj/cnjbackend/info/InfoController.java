/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.cs.cnj.cnjbackend.info;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marlei
 */
@RestController
public class InfoController {

    @RequestMapping("/info")
    public Info greeting() {
        Info result = new Info();
        result.setMessage("OK - hat alles funktioniert");
        return result;
    }
}
