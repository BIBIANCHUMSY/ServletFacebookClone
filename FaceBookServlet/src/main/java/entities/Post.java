package entities;

import java.time.LocalDateTime;
import java.util.List;

public class Post {

    private String userName;
    private String userPost;
    private List<User> usersWhoLikedPost;
    private String commentsMAdeOnPost;
    private String contents;
    private LocalDateTime timestamp;
}
