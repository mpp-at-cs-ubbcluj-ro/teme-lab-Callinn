package ro.mpp2025.domain;
import java.time.LocalDateTime;

public class Donatie extends Entity<Long>
{
    private Integer Suma;
    private LocalDateTime Data;

    public Donatie(Integer suma, LocalDateTime data)
    {
        Suma = suma;
        Data = data;
    }

    public Integer getSuma()
    {
        return Suma;
    }

    public void setSuma(Integer suma)
    {
        Suma = suma;
    }

    public LocalDateTime getData()
    {
        return Data;
    }

    public void setData(LocalDateTime data)
    {
        Data = data;
    }

    @Override
    public String toString()
    {
        return "Donatie{" +
                "Suma=" + Suma +
                ", Data=" + Data +
                '}';
    }

}
