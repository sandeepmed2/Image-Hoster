package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //This method calls the repository method to persist image comment in database
    public  Comment uploadComment(Comment comment){return commentRepository.uploadComment(comment);}
}
