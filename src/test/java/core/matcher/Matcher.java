package core.matcher;

/*
 * #%L
 * ExpectIt
 * %%
 * Copyright (C) 2014 Alexey Gavrilov and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import core.Result;

/**
 * A matcher for expect operations.
 *
 * @param <R> the result type
 * @author Alexey Gavrilov
 */
public interface Matcher<R extends Result> {
    /**
     * Matches the input string.
     *
     * @param input the current state of the input buffer
     * @param isEof indicates the input has reached the end, or closed.
     * @return the match result
     */
    R matches(String input, boolean isEof);
}
