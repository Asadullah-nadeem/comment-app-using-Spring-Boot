package example.com.comment_app.controller;

import example.com.comment_app.model.Comment;
import example.com.comment_app.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@CrossOrigin(origins = "*") // Allow CORS for all origins
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
}