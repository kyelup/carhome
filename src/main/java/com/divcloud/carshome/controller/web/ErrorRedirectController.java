 package com.divcloud.carshome.controller.web;
 
 import java.util.Map;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 
 @Controller
 @RequestMapping({"/errors"})
 public class ErrorRedirectController
 {
   @RequestMapping(value={"/error"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String renderToError(Map<String, Object> map)
   {
    return "carshome/error";
  }
 
   @RequestMapping(value={"/404"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
   public String renderToNotExit(Map<String, Object> map) {
     return "carshome/error";
  }
 }

