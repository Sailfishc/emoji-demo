package com.sailfish;

import com.sailfish.entity.Content;
import com.sailfish.mapper.EmojiMapper;
import com.vdurmont.emoji.EmojiParser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sailfish
 * @create 2017-04-01-下午4:08
 */
@RestController
public class EmojiController {

    @Autowired
    private EmojiMapper emojiMapper;


    @RequestMapping("/add/content")
    public ResponseEntity insertContent(@RequestBody Content content) {
        String title = content.getTitle();

        String titles = EmojiParser.parseToAliases(title);
        content.setTitle(titles);
        Integer integer = emojiMapper.insertContent(content);
        if (integer == 1) {
            return ResponseEntity.ok().build();
        }
        return  ResponseEntity.badRequest().build();
    }

    @RequestMapping("/get/{id}")
    public Content getById(@PathVariable("id") Integer id) {
        Content content = emojiMapper.selectById(id);
        String title = EmojiParser.parseToUnicode(content.getTitle());
        content.setTitle(title);
        if (content != null) {
            return content;
        }
        return  null;
    }
}
