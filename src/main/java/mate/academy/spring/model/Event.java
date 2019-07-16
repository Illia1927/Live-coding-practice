package mate.academy.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Entity
@Table(name = "EVENT")
@NamedEntityGraph(name = "Event.usersStatus", attributeNodes = @NamedAttributeNode("usersStatus"))
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @ManyToMany
    @MapKeyJoinColumn(name = "FK_USER_ID")
    @JoinTable(name = "USERS_TO_EVENTS",
            joinColumns = @JoinColumn(name = "FK_EVENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "FK_STATUS_ID"))
    @Column(name = "status")
    private Map<User, Status> usersStatus = new HashMap<>();

    @JoinColumn(name = "FK_ORGANIZER_ID")
    @ManyToOne
    private Organizer organizer;

    public Event() {
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<User, Status> getUsersStatus() {
        return usersStatus;
    }

    public void setUsersStatus(Map<User, Status> usersStatus) {
        this.usersStatus = usersStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return Objects.equals(getId(), event.getId()) &&
                Objects.equals(getName(), event.getName()) &&
                Objects.equals(getUsersStatus(), event.getUsersStatus()) &&
                Objects.equals(getOrganizer(), event.getOrganizer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getUsersStatus(), getOrganizer());
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", usersStatus=" + usersStatus +
                '}';
    }
}
