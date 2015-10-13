/* 
 * $Id$
 * 
 * Copyright (c) 2015 Stephane GALLAND.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * This program is free software; you can redistribute it and/or modify
 */

package fr.utbm.info.ia54.environment.agent;

import java.util.UUID;
import java.util.logging.Logger;

import org.arakhne.afc.vmutil.locale.Locale;

import fr.utbm.info.ia54.environment.maze.Direction;

/** Interface that must be used by the player for moving his/her avatar.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
public class Player {

	private Direction lastInputDirection;
	
	private final UUID bodyId;
	private final Logger logger;
	
	Player(UUID bodyId, Logger logger) {
		this.bodyId = bodyId;
		this.logger = logger;
	}
	
	/** Move the player avatar.
	 */
	public synchronized void move(Direction direction) {
		if (this.logger != null) {
			if (direction == null) {
				this.logger.info(Locale.getString(Player.class, "NO_DIRECTION"));
			} else {
				this.logger.info(Locale.getString(Player.class, "DIRECTION", direction.name()));
			}
		}
		this.lastInputDirection = direction;
	}
	
	/** Replies the last input direction.
	 */
	synchronized Direction getDirection() {
		return this.lastInputDirection;
	}
	
	/** Replies the identifier of the body.
	 */
	public UUID getBodyId() {
		return this.bodyId;
	}

}