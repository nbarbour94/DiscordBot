package novaz.core;

import novaz.main.NovaBot;
import sx.blah.discord.api.events.Event;
import sx.blah.discord.api.events.IListener;

public abstract class AbstractEventListener<eventType extends Event> implements IListener<eventType> {
	protected NovaBot novaBot;

	public AbstractEventListener(NovaBot novaBot) {
		this.novaBot = novaBot;
	}

	abstract public boolean listenerActivated();
}
