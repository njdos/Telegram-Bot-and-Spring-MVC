package ua.wholesale.web.site.telegram.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_telegram_data")
public class UserTelegram {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "userid")
    private Long userid;

    @Column(name = "state")
    private String state;

    @Column(name = "desire")
    private String desire;

    @Column(name = "kod")
    private String kod;

    @Column(name = "good")
    private String good;

    @Column(name = "numbers")
    private String numbers;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "total_sum")
    private String total_sum;

    @Override
    public String toString() {
        return "UserTelegram{" +'\n' +
                "id=" + id +'\n' +
                " userid=" + userid +'\n' +
                " state=" + state +'\n' +
                " desire=" + desire + '\n' +
                " kod=" + kod + '\n' +
                " good=" + good + '\n' +
                " numbers=" + numbers +'\n' +
                " bio=" + bio + '\n' +
                " phone=" + phone + '\n' +
                " email=" + email + '\n' +
                " address=" + address + '\n' +
                " total_sum=" + total_sum + '\n' +
                '}';
    }
}
