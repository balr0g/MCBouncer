package com.mcbouncer.event;

import com.mcbouncer.MCBouncer;
import net.lahwran.fevents.Cancellable;
import net.lahwran.fevents.MCBEvent;
import net.lahwran.fevents.MCBHandlerList;

/**
 * Internal generic kick event.
 * 
 * WARNING: Cancelling this event will prevent 
 * the quit message from being shown, not prevent
 * the user from being kicked!
 * 
 */
public class KickEvent extends MCBEvent<KickEvent> implements Cancellable {

    protected MCBouncer controller;
    protected String user;
    public static final MCBHandlerList<KickEvent> handlers = new MCBHandlerList<KickEvent>();

    public KickEvent(MCBouncer controller, String user) {
        this.controller = controller;
        this.user = user;
    }

    public MCBouncer getController() {
        return controller;
    }

    public String getPlayer() {
        return user;
    }

    @Override
    protected MCBHandlerList<KickEvent> getHandlers() {
        return handlers;
    }

    @Override
    protected String getEventName() {
        return "KickEvent";
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
