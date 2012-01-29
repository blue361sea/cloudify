/*******************************************************************************
 * Copyright (c) 2011 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cloudifysource.shell.logging;

import java.text.MessageFormat;
import java.util.logging.ErrorManager;

/**
 * @author rafi, barakm
 * @since 2.0.0
 * 
 *        This extension of the {@link ErrorManager} prints data about occurring exceptions to the error
 *        stream.
 * 
 */
public class ShellErrorManager extends ErrorManager {

	/**
	 * Constructs an instance of {@code ErrorManager}.
	 */
	public ShellErrorManager() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(final String message, final Exception exception, final int errorCode) {

		System.err.println(MessageFormat.format("Error occurred: {0}. For more details refer to the full logs.",
				exception.getCause()));

		exception.printStackTrace(System.err);
	}
}
