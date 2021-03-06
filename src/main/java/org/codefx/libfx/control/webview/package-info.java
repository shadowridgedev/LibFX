/**
 * <p>
 * Provides functionality surrounding JavaFX' {@link javafx.scene.web.WebView WebView}. All of it can be accessed via
 * the utility class {@link org.codefx.libfx.control.webview.WebViews WebViews}.
 * </p>
 * <h2>Hyperlink Listener</h2>
 * <p>
 * The {@code WebView} provides no pleasant way to add an equivalent of Swing's
 * {@link javax.swing.event.HyperlinkListener HyperlinkListener}.
 * <p>
 * This can now be done by implementing a {@link org.codefx.libfx.control.webview.WebViewHyperlinkListener
 * WebViewHyperlinkListener}, which is very similar to Swing's {@code HyperlinkListener} and also processes
 * {@link javax.swing.event.HyperlinkEvent HyperlinkEvents}. Together with a {@code WebView} and optionally an event
 * filter it can be handed to {@code WebViews}'
 * {@link org.codefx.libfx.control.webview.WebViews#addHyperlinkListener(javafx.scene.web.WebView, WebViewHyperlinkListener)
 * addHyperlinkListener} method.
 * <p>
 * Adding listeners returns a {@link org.codefx.libfx.control.webview.WebViewHyperlinkListenerHandle
 * WebViewHyperlinkListenerHandle} which can be used to easily attach and detach the listener.
 *
 * @see org.codefx.libfx.control.webview.WebViews WebViews
 */
package org.codefx.libfx.control.webview;

