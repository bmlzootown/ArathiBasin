package com.snowgears.arathibasin.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This is a custom event that is called whenever an Arathi Basin game ends.
 */

public class GameEndEvent extends Event{

    private static final HandlerList handlers = new HandlerList();

    public GameEndEvent() {

    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
