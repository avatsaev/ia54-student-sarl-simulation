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

import io.sarl.lang.core.AgentContext;

import java.util.UUID;

/** Constants related to the SARL spaces between the environment agent and the other agents.
*
* @author $Author: sgalland$
* @version $FullVersion$
* @mavengroupid $GroupId$
* @mavenartifactid $ArtifactId$
*/
final class MazeSpaceUtils {

	private MazeSpaceUtils() {
		//
	}

	/** Replies the identifier of the physic space in the given context.
	 *
	 * @param context - the context to consider.
	 * @return the id of the Jaak space.
	 */
	public static UUID getSpaceIDInContext(AgentContext context) {
		return UUID.nameUUIDFromBytes((context.getID().toString() + "!!!JaakPhysicSpace").getBytes());  //$NON-NLS-1$
	}

}