package net.staniscia.rca.swing.common;

/**
 * This Icon Selector is complian to standards http://standards.freedesktop.org
 * 
 * @see http 
 *      ://standards.freedesktop.org/icon-naming-spec/icon-naming-spec-latest
 *      .html for more information
 * 
 * @version Version 0.8.90
 */
public class StatusIconsNaming {

	public String CONTEXT_ACTIONS = "status";

	/** The icon used when an appointment was missed. */
	public static final String appointment_missed = "appointment-missed";
	/** The icon used when an appointment will occur soon. */
	public static final String appointment_soon = "appointment-soon";
	/** The icon used to indicate high audio volume. */
	public static final String audio_volume_high = "audio-volume-high";
	/** The icon used to indicate low audio volume. */
	public static final String audio_volume_low = "audio-volume-low";
	/** The icon used to indicate medium audio volume. */
	public static final String audio_volume_medium = "audio-volume-medium";
	/** The icon used to indicate the muted state for audio playback. */
	public static final String audio_volume_muted = "audio-volume-muted";
	/** The icon used when the battery is below 40%. */
	public static final String battery_caution = "battery-caution";
	/** The icon used when the battery is below 20%. */
	public static final String battery_low = "battery-low";
	/**
	 * The icon used when a dialog is opened to explain an error condition to
	 * the user.
	 */
	public static final String dialog_error = "dialog-error";
	/**
	 * The icon used when a dialog is opened to give information to the user
	 * that may be pertinent to the requested action.
	 */
	public static final String dialog_information = "dialog-information";
	/**
	 * The icon used when a dialog requesting the authentication credentials for
	 * a user is opened.
	 */
	public static final String dialog_password = "dialog-password";
	/**
	 * The icon used when a dialog is opened to ask a simple question of the
	 * user.
	 */
	public static final String dialog_question = "dialog-question";
	/**
	 * The icon used when a dialog is opened to warn the user of impending
	 * issues with the requested action.
	 */
	public static final String dialog_warning = "dialog-warning";
	/**
	 * The icon used for a folder while an object is being dragged onto net, that
	 * is of a type that the directory can contain.
	 */
	public static final String folder_drag_accept = "folder-drag-accept";
	/**
	 * The icon used for folders, while their contents are being displayed
	 * within the same window. This icon would normally be shown in a tree or
	 * list view, next to the main view of a folder's contents.
	 */
	public static final String folder_open = "folder-open";
	/**
	 * The icon used for folders, while their contents are being displayed in
	 * another window. This icon would typically be used when using multiple
	 * windows to navigate the hierarchy, such as in Nautilus's spatial mode.
	 */
	public static final String folder_visiting = "folder-visiting";
	/**
	 * The icon used when another image is being loaded, such as thumnails for
	 * larger images in the file manager.
	 */
	public static final String image_loading = "image-loading";
	/** The icon used when another image could not be loaded. */
	public static final String image_missing = "image-missing";
	/** The icon used for an electronic mail that contains attachments. */
	public static final String mail_attachment = "mail-attachment";
	/** The icon used for an electronic mail that is unread. */
	public static final String mail_unread = "mail-unread";
	/** The icon used for an electronic mail that is read. */
	public static final String mail_read = "mail-read";
	/** The icon used for an electronic mail that has been replied to. */
	public static final String mail_replied = "mail-replied";
	/** The icon used for an electronic mail that contains a signature. */
	public static final String mail_signed = "mail-signed";
	/**
	 * The icon used for an electronic mail that contains a signature which has
	 * also been verified by the security system.
	 */
	public static final String mail_signed_verified = "mail-signed-verified";
	/** The icon for the repeat mode of a media player. */
	public static final String media_playlist_repeat = "media-playlist-repeat";
	/** The icon for the shuffle mode of a media player. */
	public static final String media_playlist_shuffle = "media-playlist-shuffle";
	/**
	 * The icon used when an error occurs trying to intialize the network
	 * connection of the computing device. This icon should be two computers,
	 * one in the background, with the screens of both computers, colored black,
	 * and with the theme's style element for errors, overlayed on top of the
	 * icon.
	 */
	public static final String network_error = "network-error";
	/**
	 * The icon used when no data is being transmitted or received, while the
	 * computing device is connected to a network. This icon should be two
	 * computers, one in the background, with the screens of both computers,
	 * colored black.
	 */
	public static final String network_idle = "network-idle";
	/**
	 * The icon used when the computing device is disconnected from the network.
	 * This icon should be a computer in the background, with a screen colored
	 * black, and the theme's icon element to show that a device is not
	 * accessible, in the foreground.
	 */
	public static final String network_offline = "network-offline";
	/**
	 * The icon used when data is being received, while the computing device is
	 * connected to a network. This icon should be two computers, one in the
	 * background, with its screen colored green, and the screen of the computer
	 * in the foreground, colored black.
	 */
	public static final String network_receive = "network-receive";
	/**
	 * The icon used when data is being transmitted, while the computing device
	 * is connected to a network. This icon should be two computers, one in the
	 * background, with its screen colored black, and the screen of the computer
	 * in the foreground, colored green.
	 */
	public static final String network_transmit = "network-transmit";
	/**
	 * The icon used data is being both transmitted and received simultaneously,
	 * while the computing device is connected to a network. This icon should be
	 * two computers, one in the background, with the screens of both computers,
	 * colored green.
	 */
	public static final String network_transmit_receive = "network-transmit-receive";
	/**
	 * The icon used when an error occurs while attempting to print. This icon
	 * should be the theme's printer device icon, with the theme's style element
	 * for errors, overlayed on top of the icon.
	 */
	public static final String printer_error = "printer-error";
	/**
	 * The icon used while a print job is successfully being spooled to a
	 * printing device. This icon should be the theme's printer device icon,
	 * with a document emerging from the printing device.
	 */
	public static final String printer_printing = "printer-printing";
	/**
	 * The icon used to indicate that the security level of a connection is
	 * known to be secure, using strong encryption and a valid certificate.
	 */
	public static final String security_high = "security-high";
	/**
	 * The icon used to indicate that the security level of a connection is
	 * presumed to be secure, using strong encryption, and a certificate that
	 * could not be automatically verified, but which the user has chosen to
	 * trust.
	 */
	public static final String security_medium = "security-medium";
	/**
	 * The icon used to indicate that the security level of a connection is
	 * presumed to be insecure, either by using weak encryption, or by using a
	 * certificate that the could not be automatically verified, and which the
	 * user has not chosent to trust.
	 */
	public static final String security_low = "security-low";
	/**
	 * The icon used when an update is available for software installed on the
	 * computing device, through the system software update program.
	 */
	public static final String software_update_available = "software-update-available";
	/**
	 * The icon used when an urgent update is available through the system
	 * software update program.
	 */
	public static final String software_update_urgent = "software-update-urgent";
	/**
	 * The icon used when an error occurs while attempting to synchronize data
	 * from the computing device, to another device.
	 */
	public static final String sync_error = "sync-error";
	/**
	 * The icon used while data is successfully synchronizing to another device.
	 */
	public static final String sync_synchronizing = "sync-synchronizing";
	/** The icon used when a task is due soon. */
	public static final String task_due = "task-due";
	/** The icon used when a task that was due, has been left incomplete. */
	public static final String task_past_due = "task-past-due";
	/**
	 * The icon used when a user on a chat network is available to initiate a
	 * conversation with.
	 */
	public static final String user_available = "user-available";
	/**
	 * The icon used when a user on a chat network is away from their keyboard
	 * and the chat program.
	 */
	public static final String user_away = "user-away";
	/**
	 * The icon used when a user on a chat network has not been an active
	 * participant in any chats on the network, for an extended period of time.
	 */
	public static final String user_idle = "user-idle";
	/** The icon used when a user on a chat network is not available. */
	public static final String user_offline = "user-offline";
	/**
	 * The icon for the user's �Trash� in the desktop's file manager, when there
	 * are items in the �Trash� waiting for disposal or recovery.
	 */
	public static final String user_trash_full = "user-trash-full";
	/** The icon used while the weather for a region is �clear skies�. */
	public static final String weather_clear = "weather-clear";
	/**
	 * The icon used while the weather for a region is �clear skies� during the
	 * night.
	 */
	public static final String weather_clear_night = "weather-clear-night";
	/** The icon used while the weather for a region is �partly cloudy�. */
	public static final String weather_few_clouds = "weather-few-clouds";
	/**
	 * The icon used while the weather for a region is �partly cloudy� during
	 * the night.
	 */
	public static final String weather_few_clouds_night = "weather-few-clouds-night";
	/** The icon used while the weather for a region is �foggy�. */
	public static final String weather_fog = "weather-fog";
	/** The icon used while the weather for a region is �overcast�. */
	public static final String weather_overcast = "weather-overcast";
	/** The icon used while a sever weather alert is in effect for a region. */
	public static final String weather_severe_alert = "weather-severe-alert";
	/** The icon used while rain showers are occurring in a region. */
	public static final String weather_showers = "weather-showers";
	/** The icon used while scattered rain showers are occurring in a region. */
	public static final String weather_showers_scattered = "weather-showers-scattered";
	/** The icon used while snow showers are occurring in a region. */
	public static final String weather_snow = "weather-snow";
	/** The icon used while storms are occurring in a region. */
	public static final String weather_storm = "weather-storm";

}
