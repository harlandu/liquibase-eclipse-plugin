/**
 * Copyright 2012 Nick Wilson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.svcdelivery.liquibase.eclipse.internal.ui;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author nick
 */
public class LiquibaseResultsContentProvider implements
		IStructuredContentProvider {

	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput,
			final Object newInput) {
	}

	@Override
	public final Object[] getElements(final Object input) {
		Object[] items = new Object[0];
		if (input instanceof LiquibaseResults) {
			final LiquibaseResults results = (LiquibaseResults) input;
			items = results.getResults().toArray();
		}
		return items;
	}

	@Override
	public void dispose() {
	}

}
