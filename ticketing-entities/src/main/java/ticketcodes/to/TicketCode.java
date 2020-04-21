package ticketcodes.to;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class TicketCode  implements Serializable {

    //TODO constructor without sold

    @Id
    @Column(name = "ticket_code_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
//   @GraphQLQuery(name = "id", description = "El identificador del código")
    private Long id;

    /**
     * maximum 20chars
     * e.g. AlPH28782638
     */
    @Size(max = 20, min = 9)
    private String code;

    /**
     * e.g. Cinemex, Cinepolis, Hallmar
     */
    @OneToOne
    private Chain chain;

    /**
     * dd/MM/yyyy
     */
    @NotNull
    private Date expiration;

    /**
     * e.g. 3D, VIP, Regular
     */
    TeatherType teatherType;

    /**
     * e.g. true, false
     */
    private Boolean sold;
    //TODO a futuro cambiar este por un status: vendido apartado, disponible
}
