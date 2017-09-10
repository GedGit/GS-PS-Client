package loader;

import java.net.URL;

class AudioClip implements java.applet.AudioClip {

	public static final short STATE_STOPPED = 0;
	public static final short STATE_PLAYING = 1;
	public static final short STATE_LOOPING = 2;
	private final URL sourceURL;
	private short audioClipState;

	public AudioClip(final URL sourceURL) {
		super();
		this.sourceURL = sourceURL;
		audioClipState = 0;
	}

	public short getAudioClipState() {
		return audioClipState;
	}

	public URL getURL() {
		return sourceURL;
	}

	@Override
	public boolean equals(final Object var1) {
		if (var1 == null) {
			return false;
		} else if (var1 == this) {
			return true;
		} else if (!(var1 instanceof AudioClip)) {
			return false;
		} else {
			final AudioClip ac = (AudioClip) var1;
			return (ac.getAudioClipState() == audioClipState) && ac.getURL().equals(sourceURL);
		}
	}

	@Override
	public void play() {
		audioClipState = 1;
	}

	@Override
	public void loop() {
		audioClipState = 2;
	}

	@Override
	public void stop() {
		audioClipState = 0;
	}
}
