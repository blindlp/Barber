package gt.com.irc.barber.lib.base;

public interface EventBus {
    void register(Object sub); // registrar evento
    void unRegister(Object sub); // desligar evento
    void post(Object obj); // enviar evento
}
