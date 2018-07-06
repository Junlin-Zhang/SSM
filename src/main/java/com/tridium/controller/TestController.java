package com.tridium.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tridium.model.Book;
import com.tridium.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    BookService bookService;
    @RequestMapping("index")
    public String test(){
        return "testIndex";
    }

    @ResponseBody
    @RequestMapping("index2")
    public String test2(){
        List<Book> books = bookService.listBooks();
        JSONArray jsonArray = new JSONArray();
        for (Book book : books){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id",book.getId());
            jsonObject.put("name",book.getName());
            jsonObject.put("author",book.getAuthor());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toJSONString();
    }
}
