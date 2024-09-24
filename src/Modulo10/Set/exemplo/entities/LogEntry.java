package Modulo10.Set.exemplo.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String name;
    private Date moment;

    public LogEntry(Date moment, String name) {
        this.moment = moment;
        this.name = name;
    }

    public Date getMoment() {
        return moment;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(getName(), logEntry.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}
