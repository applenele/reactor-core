/*
 * Copyright (c) 2011-2016 Pivotal Software Inc, All Rights Reserved.
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
 */

/**
 * This package offers a suite of asynchronous {@link org.reactivestreams.Publisher} with backpressure support.
 *
 * <p>
 * These components will generally bound to a given stream of data except
 * for the {@link reactor.core.publisher.ProcessorGroup} that allows
 *  {@link org.reactivestreams.Processor} Pooling.
 *
 * <p>
 * A {@link reactor.core.publisher.ProcessorExecutor} will manage its own thread(s), one by {@link org.reactivestreams.Subscriber}.
 * The message-passing will be implementation dependent, e.g. using a {@link reactor.core.queue.RingBuffer}.
 * Usually, the boundary will be implemented with a queue-based event dispatching and the Reactive Stream contract will
 * offer control over the available backlog. Long.MAX demand will however switch off the contract and rely on the impl
 * coordination strategy to back-off, like the RingBuffer waiting strategy, to slow down the Processor publisher.
 *
 * @author Stephane Maldini
 */
package reactor.core.publisher;