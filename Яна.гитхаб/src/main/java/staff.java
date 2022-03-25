import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="staff")
public class staff {
    @Id
    private Integer Id;
    private Integer name;
    private Integer position;
    private Integer college;
    private Integer age;
    private Integer experience;
    private Integer salary;

}
