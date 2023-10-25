package entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Like {

    private int id;
    private int postId;
    private int commentId;
    private int userId;
    private LocalDateTime timestamp;
}
