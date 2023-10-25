package entities;

import java.time.LocalDateTime;

public class Comments {

    private int id;
    private int postId;
    private User user;
    private String comment;
    private LocalDateTime timestamp;
}
