package entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LikePost {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int like_id;
@ManyToOne
@JoinColumn(name="fk_emp_id")
Employe employe;
@ManyToOne
@JoinColumn(name="fk_post_id")
Post post;
}
