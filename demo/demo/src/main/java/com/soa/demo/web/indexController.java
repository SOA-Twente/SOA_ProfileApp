package com.soa.demo.web;

import com.soa.demo.objects.Message;
import com.soa.demo.objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import javax.websocket.EncodeException;
//import java.io.IOException;


@RestController
public class indexController {

    @GetMapping("/{username}/messages/")
    public String nothing(@PathVariable String username, Model model){
        return "nothing";
    }

    @PostMapping("/{username}/postMessage")
    public Message postMessage(@PathVariable String username, @RequestBody Message message){

        return message;
    }

    @PostMapping("addUser")
    public User addUser(@RequestBody User user){
        return user;
    }






}
