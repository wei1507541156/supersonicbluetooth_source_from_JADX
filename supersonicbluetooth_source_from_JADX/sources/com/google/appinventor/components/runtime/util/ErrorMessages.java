package com.google.appinventor.components.runtime.util;

import java.util.HashMap;
import java.util.Map;

public final class ErrorMessages {
    public static final int ERROR_ACTIONBAR_NOT_SUPPORTED = 907;
    public static final int ERROR_ACTIVITY_STARTER_NO_ACTION_INFO = 602;
    public static final int ERROR_ACTIVITY_STARTER_NO_CORRESPONDING_ACTIVITY = 601;
    public static final int ERROR_BAD_PERCENT = 2801;
    public static final int ERROR_BAD_VALUE_FOR_ACCELEROMETER_SENSITIVITY = 1901;
    public static final int ERROR_BAD_VALUE_FOR_HORIZONTAL_ALIGNMENT = 1401;
    public static final int ERROR_BAD_VALUE_FOR_TEXT_RECEIVING = 1701;
    public static final int ERROR_BAD_VALUE_FOR_VERTICAL_ALIGNMENT = 1402;
    public static final int ERROR_BLUETOOTH_COULD_NOT_DECODE = 510;
    public static final int ERROR_BLUETOOTH_COULD_NOT_DECODE_ELEMENT = 513;
    public static final int ERROR_BLUETOOTH_COULD_NOT_FIT_ELEMENT_IN_BYTE = 514;
    public static final int ERROR_BLUETOOTH_COULD_NOT_FIT_NUMBER_IN_BYTE = 511;
    public static final int ERROR_BLUETOOTH_COULD_NOT_FIT_NUMBER_IN_BYTES = 512;
    public static final int ERROR_BLUETOOTH_END_OF_STREAM = 518;
    public static final int ERROR_BLUETOOTH_INVALID_ADDRESS = 503;
    public static final int ERROR_BLUETOOTH_INVALID_UUID = 506;
    public static final int ERROR_BLUETOOTH_NOT_AVAILABLE = 501;
    public static final int ERROR_BLUETOOTH_NOT_CONNECTED_TO_DEVICE = 515;
    public static final int ERROR_BLUETOOTH_NOT_ENABLED = 502;
    public static final int ERROR_BLUETOOTH_NOT_PAIRED_DEVICE = 504;
    public static final int ERROR_BLUETOOTH_NOT_REQUIRED_CLASS_OF_DEVICE = 505;
    public static final int ERROR_BLUETOOTH_UNABLE_TO_ACCEPT = 509;
    public static final int ERROR_BLUETOOTH_UNABLE_TO_CONNECT = 507;
    public static final int ERROR_BLUETOOTH_UNABLE_TO_LISTEN = 508;
    public static final int ERROR_BLUETOOTH_UNABLE_TO_READ = 517;
    public static final int ERROR_BLUETOOTH_UNABLE_TO_WRITE = 516;
    public static final int ERROR_BLUETOOTH_UNSUPPORTED_ENCODING = 519;
    public static final int ERROR_CAMCORDER_NO_CLIP_RETURNED = 1201;
    public static final int ERROR_CAMERA_NO_IMAGE_RETURNED = 201;
    public static final int ERROR_CANNOT_COPY_MEDIA = 1602;
    public static final int ERROR_CANNOT_CREATE_FILE = 2103;
    public static final int ERROR_CANNOT_DELETE_ASSET = 2105;
    public static final int ERROR_CANNOT_FIND_FILE = 2101;
    public static final int ERROR_CANNOT_READ_FILE = 2102;
    public static final int ERROR_CANNOT_SAVE_IMAGE = 1601;
    public static final int ERROR_CANNOT_WRITE_ASSET = 2106;
    public static final int ERROR_CANNOT_WRITE_TO_FILE = 2104;
    public static final int ERROR_CANVAS_BITMAP_ERROR = 1001;
    public static final int ERROR_CANVAS_DRAW_SHAPE_BAD_ARGUMENT = 1004;
    public static final int ERROR_CANVAS_HEIGHT_ERROR = 1003;
    public static final int ERROR_CANVAS_WIDTH_ERROR = 1002;
    public static final int ERROR_DIVISION_BY_ZERO = 3200;
    public static final int ERROR_EV3_BLUETOOTH_NOT_SET = 3100;
    public static final int ERROR_EV3_ILLEGAL_ARGUMENT = 3103;
    public static final int ERROR_EV3_ILLEGAL_MOTOR_PORT = 3104;
    public static final int ERROR_EV3_ILLEGAL_SENSOR_PORT = 3105;
    public static final int ERROR_EV3_INVALID_REPLY = 3102;
    public static final int ERROR_EV3_NOT_CONNECTED_TO_ROBOT = 3101;
    public static final int ERROR_EXCEPTION_DURING_MAP_SAVE = 3412;
    public static final int ERROR_EXPECTED_ARRAY_AT_INDEX = 3420;
    public static final int ERROR_EXTENSION_ERROR = 3300;
    public static final int ERROR_FILE_NOT_FOUND_FOR_SHARING = 2001;
    public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_CONTACT_EMAIL = 1;
    public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_EMAIL_PICKER = 2;
    public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_FUSIONTABLES_CONTROL = 3;
    public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_WEB_COOKIES = 4;
    public static final int ERROR_FUNCTIONALITY_NOT_SUPPORTED_WIFI_DIRECT = 5;
    public static final int ERROR_ILLEGAL_DATE = 2401;
    public static final int ERROR_ILLEGAL_HOUR = 2301;
    public static final int ERROR_ILLEGAL_MINUTE = 2302;
    public static final int ERROR_IMAGE_CANNOT_ROTATE = 3001;
    public static final int ERROR_INVALID_ANCHOR_HORIZONTAL = 3417;
    public static final int ERROR_INVALID_ANCHOR_VERTICAL = 3416;
    public static final int ERROR_INVALID_CONFIGURATION_VALUE = 3700;
    public static final int ERROR_INVALID_GEOJSON = 3411;
    public static final int ERROR_INVALID_LATITUDE = 3413;
    public static final int ERROR_INVALID_LATITUDE_IN_POINT_AT_INDEX = 3418;
    public static final int ERROR_INVALID_LONGITUDE = 3414;
    public static final int ERROR_INVALID_LONGITUDE_IN_POINT_AT_INDEX = 3419;
    public static final int ERROR_INVALID_NUMBER_OF_VALUES_IN_POINT = 3409;
    public static final int ERROR_INVALID_NUMBER_OF_VALUES_IN_POINT_AT_INDEX = 3408;
    public static final int ERROR_INVALID_POINT = 3405;
    public static final int ERROR_INVALID_POINT_AT_INDEX = 3406;
    public static final int ERROR_INVALID_SCREEN_ORIENTATION = 901;
    public static final int ERROR_INVALID_TYPE = 3410;
    public static final int ERROR_INVALID_TYPE_AT_INDEX = 3407;
    public static final int ERROR_INVALID_UNIT_SYSTEM = 3421;
    public static final int ERROR_LINESTRING_PARSE_ERROR = 3402;
    public static final int ERROR_LINESTRING_TOO_FEW_FIELDS = 3403;
    public static final int ERROR_LINESTRING_TOO_FEW_POINTS = 3401;
    public static final int ERROR_LOCATION_NO_PERMISSION = 103;
    public static final int ERROR_LOCATION_SENSOR_LATITUDE_NOT_FOUND = 101;
    public static final int ERROR_LOCATION_SENSOR_LONGITUDE_NOT_FOUND = 102;
    public static final int ERROR_MEDIA_CANNOT_OPEN = 707;
    public static final int ERROR_MEDIA_EXTERNAL_STORAGE_NOT_AVAILABLE = 705;
    public static final int ERROR_MEDIA_EXTERNAL_STORAGE_READONLY = 704;
    public static final int ERROR_MEDIA_FILE_ERROR = 708;
    public static final int ERROR_MEDIA_IMAGE_FILE_FORMAT = 706;
    public static final int ERROR_NO_CALL_PERMISSION = 3501;
    public static final int ERROR_NO_CAMERA_PERMISSION = 202;
    public static final int ERROR_NO_FOCUSABLE_VIEW_FOUND = 906;
    public static final int ERROR_NO_READ_CONTACTS_PERMISSION = 1116;
    public static final int ERROR_NO_SCANNER_FOUND = 1501;
    public static final int ERROR_NO_SMS_PERMISSION = 1702;
    public static final int ERROR_NO_SMS_RECEIVE_PERMISSION = 1703;
    public static final int ERROR_NXT_BLUETOOTH_NOT_SET = 401;
    public static final int ERROR_NXT_CANNOT_DETECT_COLOR = 417;
    public static final int ERROR_NXT_CANNOT_DETECT_LIGHT = 418;
    public static final int ERROR_NXT_COULD_NOT_DECODE_ELEMENT = 412;
    public static final int ERROR_NXT_COULD_NOT_FIT_ELEMENT_IN_BYTE = 413;
    public static final int ERROR_NXT_DATA_TOO_LARGE = 411;
    public static final int ERROR_NXT_ERROR_CODE_RECEIVED = 404;
    public static final int ERROR_NXT_INVALID_DESTINATION_ARGUMENT = 415;
    public static final int ERROR_NXT_INVALID_FILE_NAME = 406;
    public static final int ERROR_NXT_INVALID_GENERATE_COLOR = 419;
    public static final int ERROR_NXT_INVALID_MAILBOX = 409;
    public static final int ERROR_NXT_INVALID_MOTOR_PORT = 407;
    public static final int ERROR_NXT_INVALID_PROGRAM_NAME = 405;
    public static final int ERROR_NXT_INVALID_RETURN_PACKAGE = 403;
    public static final int ERROR_NXT_INVALID_SENSOR_PORT = 408;
    public static final int ERROR_NXT_INVALID_SOURCE_ARGUMENT = 414;
    public static final int ERROR_NXT_MESSAGE_TOO_LONG = 410;
    public static final int ERROR_NXT_NOT_CONNECTED_TO_ROBOT = 402;
    public static final int ERROR_NXT_UNABLE_TO_DOWNLOAD_FILE = 416;
    public static final int ERROR_OUT_OF_MEMORY_LOADING_MEDIA = 711;
    public static final int ERROR_PERMISSION_DENIED = 908;
    public static final int ERROR_PHONE_UNSUPPORTED_CONTACT_PICKER = 1107;
    public static final int ERROR_PHONE_UNSUPPORTED_SEARCH_IN_CONTACT_PICKING = 1108;
    public static final int ERROR_PLAYER_INVALID_VOLUME = 712;
    public static final int ERROR_POLYGON_PARSE_ERROR = 3404;
    public static final int ERROR_REPL_SECURITY_ERROR = 1801;
    public static final int ERROR_SCREEN_BAD_VALUE_FOR_SENDING = 904;
    public static final int ERROR_SCREEN_BAD_VALUE_RECEIVED = 903;
    public static final int ERROR_SCREEN_INVALID_ANIMATION = 905;
    public static final int ERROR_SCREEN_NOT_FOUND = 902;
    public static final int ERROR_SOUND_NOT_READY = 710;
    public static final int ERROR_SOUND_NO_PERMISSION = 806;
    public static final int ERROR_SOUND_RECORDER = 801;
    public static final int ERROR_SOUND_RECORDER_CANNOT_CREATE = 802;
    public static final int ERROR_SOUND_RECORDER_ILLEGAL_STOP = 803;
    public static final int ERROR_SOUND_RECORDER_MAX_DURATION_REACHED = 804;
    public static final int ERROR_SOUND_RECORDER_MAX_FILESIZE_REACHED = 805;
    public static final int ERROR_TRANSLATE_JSON_RESPONSE = 2203;
    public static final int ERROR_TRANSLATE_NO_KEY_FOUND = 2201;
    public static final int ERROR_TRANSLATE_SERVICE_NOT_AVAILABLE = 2202;
    public static final int ERROR_TTS_NOT_READY = 2701;
    public static final int ERROR_TWITTER_AUTHORIZATION_FAILED = 305;
    public static final int ERROR_TWITTER_BLANK_CONSUMER_KEY_OR_SECRET = 302;
    public static final int ERROR_TWITTER_DIRECT_MESSAGE_FAILED = 310;
    public static final int ERROR_TWITTER_EXCEPTION = 303;
    public static final int ERROR_TWITTER_FOLLOW_FAILED = 311;
    public static final int ERROR_TWITTER_INVALID_IMAGE_PATH = 315;
    public static final int ERROR_TWITTER_REQUEST_DIRECT_MESSAGES_FAILED = 309;
    public static final int ERROR_TWITTER_REQUEST_FOLLOWERS_FAILED = 308;
    public static final int ERROR_TWITTER_REQUEST_FRIEND_TIMELINE_FAILED = 313;
    public static final int ERROR_TWITTER_REQUEST_MENTIONS_FAILED = 307;
    public static final int ERROR_TWITTER_SEARCH_FAILED = 314;
    public static final int ERROR_TWITTER_SET_STATUS_FAILED = 306;
    public static final int ERROR_TWITTER_STOP_FOLLOWING_FAILED = 312;
    public static final int ERROR_TWITTER_UNABLE_TO_GET_ACCESS_TOKEN = 304;
    public static final int ERROR_TWITTER_UNSUPPORTED_LOGIN_FUNCTION = 301;
    public static final int ERROR_UNABLE_TO_CREATE_TILE_CACHE = 3415;
    public static final int ERROR_UNABLE_TO_FOCUS_MEDIA = 709;
    public static final int ERROR_UNABLE_TO_INSTALL_PACKAGE = 3601;
    public static final int ERROR_UNABLE_TO_LOAD_MEDIA = 701;
    public static final int ERROR_UNABLE_TO_PLAY_MEDIA = 703;
    public static final int ERROR_UNABLE_TO_PREPARE_MEDIA = 702;
    public static final int ERROR_VIDEOPLAYER_FULLSCREEN_CANT_EXIT = 1302;
    public static final int ERROR_VIDEOPLAYER_FULLSCREEN_UNAVAILBLE = 1301;
    public static final int ERROR_VIDEOPLAYER_FULLSCREEN_UNSUPPORTED = 1303;
    public static final int ERROR_WEBVIEW_SSL_ERROR = 2501;
    public static final int ERROR_WEB_BUILD_REQUEST_DATA_NOT_LIST = 1112;
    public static final int ERROR_WEB_BUILD_REQUEST_DATA_NOT_TWO_ELEMENTS = 1113;
    public static final int ERROR_WEB_HTML_TEXT_DECODE_FAILED = 1106;
    public static final int ERROR_WEB_JSON_TEXT_DECODE_FAILED = 1105;
    public static final int ERROR_WEB_MALFORMED_URL = 1109;
    public static final int ERROR_WEB_REQUEST_HEADER_NOT_LIST = 1110;
    public static final int ERROR_WEB_REQUEST_HEADER_NOT_TWO_ELEMENTS = 1111;
    public static final int ERROR_WEB_UNABLE_TO_DELETE = 1114;
    public static final int ERROR_WEB_UNABLE_TO_GET = 1101;
    public static final int ERROR_WEB_UNABLE_TO_POST_OR_PUT = 1103;
    public static final int ERROR_WEB_UNABLE_TO_POST_OR_PUT_FILE = 1104;
    public static final int ERROR_WEB_UNSUPPORTED_ENCODING = 1102;
    public static final int ERROR_WEB_XML_TEXT_DECODE_FAILED = 1115;
    public static final int FUSION_TABLES_QUERY_ERROR = 2601;
    private static final Map<Integer, String> errorMessages = new HashMap();

    static {
        errorMessages.put(Integer.valueOf(1), "Warning: This app contains functionality that does not work on this phone: picking an EmailAddress.");
        errorMessages.put(Integer.valueOf(2), "Warning: This app contains functionality that does not work on this phone: the EmailPicker component.");
        errorMessages.put(Integer.valueOf(3), "Warning: This app contains functionality that does not work on this phone: the FusiontablesControl component.");
        errorMessages.put(Integer.valueOf(4), "Warning: This app contains functionality that does not work on this phone: using cookies in the Web component.");
        errorMessages.put(Integer.valueOf(5), "Warning: This app contains functionality that does not work on this phone: Wi-Fi peer-to-peer connectivity.");
        errorMessages.put(Integer.valueOf(101), "Unable to find latitude from %s.");
        errorMessages.put(Integer.valueOf(102), "Unable to find longitude from %s.");
        errorMessages.put(Integer.valueOf(103), "Location Permission was Denied.");
        errorMessages.put(Integer.valueOf(ERROR_CAMERA_NO_IMAGE_RETURNED), "The camera did not return an image.");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_UNSUPPORTED_LOGIN_FUNCTION), "Twitter no longer supports this form of Login. Use the Authorize call instead.");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_BLANK_CONSUMER_KEY_OR_SECRET), "The ConsumerKey and ConsumerSecret properties must be set in order to authorize access for Twitter. Please obtain a Comsumer Key and Consumer Secret specific to your app from http://twitter.com/oauth_clients/new");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_EXCEPTION), "Twitter error: %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_UNABLE_TO_GET_ACCESS_TOKEN), "Unable to get access token: %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_AUTHORIZATION_FAILED), "Twitter authorization failed");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_SET_STATUS_FAILED), "SetStatus failed. %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_REQUEST_MENTIONS_FAILED), "RequestMentions failed. %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_REQUEST_FOLLOWERS_FAILED), "RequestFollowers failed. %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_REQUEST_DIRECT_MESSAGES_FAILED), "RequestDirectMessages failed. %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_DIRECT_MESSAGE_FAILED), "DirectMessage failed. %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_FOLLOW_FAILED), "Follow failed. %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_STOP_FOLLOWING_FAILED), "StopFollowing failed. %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_REQUEST_FRIEND_TIMELINE_FAILED), "Twitter RequestFriendTimeline failed: %s");
        errorMessages.put(Integer.valueOf(ERROR_TWITTER_SEARCH_FAILED), "Twitter search failed.");
        errorMessages.put(Integer.valueOf(315), "Invalid Path to Image; Update will not be sent.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_BLUETOOTH_NOT_SET), "The Bluetooth property has not been set.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_NOT_CONNECTED_TO_ROBOT), "Not connected to a robot.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_RETURN_PACKAGE), "Unable to receive return package. Has the robot gone to sleep?");
        errorMessages.put(Integer.valueOf(404), "Error code received from robot: %s.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_PROGRAM_NAME), "Invalid program name.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_FILE_NAME), "Invalid file name.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_MOTOR_PORT), "The NXT does not have a motor port labeled %s.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_SENSOR_PORT), "The NXT does not have a sensor port labeled %s.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_MAILBOX), "The NXT does not have a mailbox number %s.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_MESSAGE_TOO_LONG), "The NXT only accepts messages up to 58 characters.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_DATA_TOO_LARGE), "The data is too large; it must be 16 bytes or less.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_COULD_NOT_DECODE_ELEMENT), "Could not decode element %s as an integer.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_COULD_NOT_FIT_ELEMENT_IN_BYTE), "Could not fit element %s into 1 byte.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_SOURCE_ARGUMENT), "Invalid source argument.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_DESTINATION_ARGUMENT), "Invalid destination argument.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_UNABLE_TO_DOWNLOAD_FILE), "Unable to download file to robot: %s");
        errorMessages.put(Integer.valueOf(ERROR_NXT_CANNOT_DETECT_COLOR), "Cannot detect color when the DetectColor property is set to False.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_CANNOT_DETECT_LIGHT), "Cannot detect light level when the DetectColor property is set to True.");
        errorMessages.put(Integer.valueOf(ERROR_NXT_INVALID_GENERATE_COLOR), "The GenerateColor property is limited to None, Red, Green, or Blue.");
        errorMessages.put(Integer.valueOf(ERROR_EV3_BLUETOOTH_NOT_SET), "The Bluetooth property has not been set.");
        errorMessages.put(Integer.valueOf(ERROR_EV3_NOT_CONNECTED_TO_ROBOT), "Cannot connect to an EV3 robot. Has the robot gone to sleep?");
        errorMessages.put(Integer.valueOf(ERROR_EV3_INVALID_REPLY), "Unable to receive a reply or the reply cannot be understood.");
        errorMessages.put(Integer.valueOf(ERROR_EV3_ILLEGAL_ARGUMENT), "Illegal argument: %s");
        errorMessages.put(Integer.valueOf(ERROR_EV3_ILLEGAL_MOTOR_PORT), "Cannot understant motor port: %s");
        errorMessages.put(Integer.valueOf(ERROR_EV3_ILLEGAL_SENSOR_PORT), "Cannot understant sensor port: %s");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_NOT_AVAILABLE), "Bluetooth is not available.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_NOT_ENABLED), "Bluetooth is not available.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_INVALID_ADDRESS), "The specified address is not a valid Bluetooth MAC address.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_NOT_PAIRED_DEVICE), "The specified address is not a paired Bluetooth device.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_NOT_REQUIRED_CLASS_OF_DEVICE), "The specified address is not the required class of device.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_INVALID_UUID), "The UUID \"%s\" is not formatted correctly.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_UNABLE_TO_CONNECT), "Unable to connect. Is the device turned on?");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_UNABLE_TO_LISTEN), "Unable to listen for a connection from a bluetooth device.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_UNABLE_TO_ACCEPT), "Unable to accept a connection from a bluetooth device.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_COULD_NOT_DECODE), "Could not decode \"%s\" as an integer.");
        errorMessages.put(Integer.valueOf(511), "Could not fit \"%s\" into 1 byte.");
        errorMessages.put(Integer.valueOf(512), "Could not fit \"%s\" into %s bytes.");
        errorMessages.put(Integer.valueOf(513), "Could not decode element %s as an integer.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_COULD_NOT_FIT_ELEMENT_IN_BYTE), "Could not fit element %s into 1 byte.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_NOT_CONNECTED_TO_DEVICE), "Not connected to a Bluetooth device.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_UNABLE_TO_WRITE), "Unable to write: %s");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_UNABLE_TO_READ), "Unable to read: %s");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_END_OF_STREAM), "End of stream has been reached.");
        errorMessages.put(Integer.valueOf(ERROR_BLUETOOTH_UNSUPPORTED_ENCODING), "The encoding %s is not supported.");
        errorMessages.put(Integer.valueOf(ERROR_ACTIVITY_STARTER_NO_CORRESPONDING_ACTIVITY), "No corresponding activity was found.");
        errorMessages.put(Integer.valueOf(ERROR_ACTIVITY_STARTER_NO_ACTION_INFO), "No Action information in ActivityStarter was found.");
        errorMessages.put(Integer.valueOf(ERROR_UNABLE_TO_LOAD_MEDIA), "Unable to load %s.");
        errorMessages.put(Integer.valueOf(ERROR_UNABLE_TO_PREPARE_MEDIA), "Unable to prepare %s.");
        errorMessages.put(Integer.valueOf(ERROR_UNABLE_TO_PLAY_MEDIA), "Unable to play %s.");
        errorMessages.put(Integer.valueOf(ERROR_MEDIA_EXTERNAL_STORAGE_READONLY), "External storage is available but read-only.");
        errorMessages.put(Integer.valueOf(ERROR_MEDIA_EXTERNAL_STORAGE_NOT_AVAILABLE), "External storage is not available.");
        errorMessages.put(Integer.valueOf(ERROR_MEDIA_IMAGE_FILE_FORMAT), "Image file name must end in \".jpg\", \".jpeg\", or \".png\".");
        errorMessages.put(Integer.valueOf(ERROR_MEDIA_CANNOT_OPEN), "Cannot open file %s.");
        errorMessages.put(Integer.valueOf(ERROR_MEDIA_FILE_ERROR), "Got file error: %s.");
        errorMessages.put(Integer.valueOf(ERROR_UNABLE_TO_FOCUS_MEDIA), "Unable to grant exclusive lock of audio output stream to %s.");
        errorMessages.put(Integer.valueOf(ERROR_SOUND_NOT_READY), "The sound is not ready to play: %s.");
        errorMessages.put(Integer.valueOf(ERROR_OUT_OF_MEMORY_LOADING_MEDIA), "Not Enough Memory to load: %s.");
        errorMessages.put(Integer.valueOf(ERROR_PLAYER_INVALID_VOLUME), "Invalid volume: %s. Volume must be set to a number between 0 and 100.");
        errorMessages.put(Integer.valueOf(ERROR_SOUND_RECORDER), "An unexpected error occurred while recording sound.");
        errorMessages.put(Integer.valueOf(ERROR_SOUND_RECORDER_CANNOT_CREATE), "Cannot start recording: %s");
        errorMessages.put(Integer.valueOf(ERROR_SOUND_RECORDER_ILLEGAL_STOP), "Stop() called when not recording.");
        errorMessages.put(Integer.valueOf(ERROR_SOUND_RECORDER_MAX_DURATION_REACHED), "Maximum sound recording duration was reached.");
        errorMessages.put(Integer.valueOf(ERROR_SOUND_RECORDER_MAX_FILESIZE_REACHED), "Maximum sound recording size was reached.");
        errorMessages.put(Integer.valueOf(ERROR_SOUND_NO_PERMISSION), "RECORD_AUDIO permission denied");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_SCREEN_ORIENTATION), "The specified screen orientation is not valid: %s");
        errorMessages.put(Integer.valueOf(ERROR_SCREEN_NOT_FOUND), "Screen not found: %s");
        errorMessages.put(Integer.valueOf(ERROR_SCREEN_BAD_VALUE_RECEIVED), "Bad value received from other screen: %s");
        errorMessages.put(Integer.valueOf(ERROR_SCREEN_BAD_VALUE_FOR_SENDING), "Bad value for sending to other screen: %s");
        errorMessages.put(Integer.valueOf(ERROR_SCREEN_INVALID_ANIMATION), "Bad value for screen open/close animation: %s");
        errorMessages.put(Integer.valueOf(ERROR_NO_FOCUSABLE_VIEW_FOUND), "No Focusable View Found");
        errorMessages.put(Integer.valueOf(ERROR_ACTIONBAR_NOT_SUPPORTED), "ActionBar is not supported on this device.");
        errorMessages.put(Integer.valueOf(ERROR_PERMISSION_DENIED), "The permission %s has been denied. Please enable it in the Settings app.");
        errorMessages.put(Integer.valueOf(1001), "Error getting Canvas contents to save");
        errorMessages.put(Integer.valueOf(1002), "Canvas width cannot be set to non-positive number");
        errorMessages.put(Integer.valueOf(1003), "Canvas height cannot be set to non-positive number");
        errorMessages.put(Integer.valueOf(1004), "Canvas cannot draw the shape with a bad point list");
        errorMessages.put(Integer.valueOf(ERROR_WEB_UNABLE_TO_GET), "Unable to get a response with the specified URL: %s");
        errorMessages.put(Integer.valueOf(ERROR_WEB_UNSUPPORTED_ENCODING), "The encoding %s is not supported.");
        errorMessages.put(Integer.valueOf(ERROR_WEB_UNABLE_TO_POST_OR_PUT), "Unable to post or put the text \"%s\" with the specified URL: %s");
        errorMessages.put(Integer.valueOf(ERROR_WEB_UNABLE_TO_POST_OR_PUT_FILE), "Unable to post or put the file \"%s\" with the specified URL %s.");
        errorMessages.put(Integer.valueOf(ERROR_WEB_JSON_TEXT_DECODE_FAILED), "Unable to decode the JSON text: %s");
        errorMessages.put(Integer.valueOf(ERROR_WEB_HTML_TEXT_DECODE_FAILED), "Unable to decode the HTML text: %s");
        errorMessages.put(Integer.valueOf(ERROR_WEB_XML_TEXT_DECODE_FAILED), "Unable to decode the XML text: %s");
        errorMessages.put(Integer.valueOf(ERROR_WEB_MALFORMED_URL), "The specified URL is not valid: %s");
        errorMessages.put(Integer.valueOf(ERROR_WEB_REQUEST_HEADER_NOT_LIST), "The specified request headers are not valid: element %s is not a list");
        errorMessages.put(Integer.valueOf(ERROR_WEB_REQUEST_HEADER_NOT_TWO_ELEMENTS), "The specified request headers are not valid: element %s does not contain two elements");
        errorMessages.put(Integer.valueOf(ERROR_WEB_BUILD_REQUEST_DATA_NOT_LIST), "Unable to build request data: element %s is not a list");
        errorMessages.put(Integer.valueOf(ERROR_WEB_BUILD_REQUEST_DATA_NOT_TWO_ELEMENTS), "Unable to build request data: element %s does not contain two elements");
        errorMessages.put(Integer.valueOf(ERROR_WEB_UNABLE_TO_DELETE), "Unable to delete a resource with the specified URL: %s");
        errorMessages.put(Integer.valueOf(ERROR_PHONE_UNSUPPORTED_CONTACT_PICKER), "The software used in this app cannot extract contacts from this type of phone.");
        errorMessages.put(Integer.valueOf(ERROR_PHONE_UNSUPPORTED_SEARCH_IN_CONTACT_PICKING), "To pick contacts, pick them directly, without using search.");
        errorMessages.put(Integer.valueOf(ERROR_NO_READ_CONTACTS_PERMISSION), "READ_CONTACTS Permission was denied.");
        errorMessages.put(Integer.valueOf(ERROR_CAMCORDER_NO_CLIP_RETURNED), "The camcorder did not return a clip.");
        errorMessages.put(Integer.valueOf(ERROR_VIDEOPLAYER_FULLSCREEN_UNAVAILBLE), "Cannot start fullscreen mode.");
        errorMessages.put(Integer.valueOf(ERROR_VIDEOPLAYER_FULLSCREEN_CANT_EXIT), "Cannot exit fullscreen mode.");
        errorMessages.put(Integer.valueOf(ERROR_VIDEOPLAYER_FULLSCREEN_UNSUPPORTED), "Fullscreen mode not supported on this version of Android.");
        errorMessages.put(Integer.valueOf(ERROR_BAD_VALUE_FOR_HORIZONTAL_ALIGNMENT), "The value -- %s -- provided for HorizontalAlignment was bad.  The only legal values are 1, 2, or 3.");
        errorMessages.put(Integer.valueOf(ERROR_BAD_VALUE_FOR_VERTICAL_ALIGNMENT), "The value -- %s -- provided for VerticalAlignment was bad.  The only legal values are 1, 2, or 3.");
        errorMessages.put(Integer.valueOf(ERROR_NO_SCANNER_FOUND), "Your device does not have a scanning application installed.");
        errorMessages.put(Integer.valueOf(ERROR_CANNOT_SAVE_IMAGE), "Unable to save image: %s");
        errorMessages.put(Integer.valueOf(ERROR_CANNOT_COPY_MEDIA), "Unable to copy selected media: %s");
        errorMessages.put(Integer.valueOf(ERROR_NO_CAMERA_PERMISSION), "Permission to use the Camera denied.");
        errorMessages.put(Integer.valueOf(ERROR_BAD_VALUE_FOR_TEXT_RECEIVING), "Text Receiving should be either 1, 2 or 3.");
        errorMessages.put(Integer.valueOf(ERROR_NO_SMS_PERMISSION), "You do not have SEND_SMS permission");
        errorMessages.put(Integer.valueOf(ERROR_NO_SMS_RECEIVE_PERMISSION), "You do not have RECEIVE_SMS permission");
        errorMessages.put(Integer.valueOf(ERROR_REPL_SECURITY_ERROR), "Security Error Receiving Blocks from Browser.");
        errorMessages.put(Integer.valueOf(ERROR_BAD_VALUE_FOR_ACCELEROMETER_SENSITIVITY), "The value -- %s -- provided for AccelerometerSensor's sensitivity was bad. The only legal values are 1, 2, or 3.");
        errorMessages.put(Integer.valueOf(ERROR_FILE_NOT_FOUND_FOR_SHARING), "The File %s could not be found on your device.");
        errorMessages.put(Integer.valueOf(ERROR_CANNOT_FIND_FILE), "The file %s could not be found");
        errorMessages.put(Integer.valueOf(ERROR_CANNOT_READ_FILE), "The file %s could not be opened");
        errorMessages.put(Integer.valueOf(ERROR_CANNOT_CREATE_FILE), "The file %s could not be created");
        errorMessages.put(Integer.valueOf(ERROR_CANNOT_WRITE_TO_FILE), "Cannot write to file %s");
        errorMessages.put(Integer.valueOf(ERROR_CANNOT_DELETE_ASSET), "Cannot delete asset file at %s");
        errorMessages.put(Integer.valueOf(ERROR_CANNOT_WRITE_ASSET), "Cannot write asset file at %s");
        errorMessages.put(Integer.valueOf(ERROR_TRANSLATE_NO_KEY_FOUND), "Missing API key for the Yandex.Translate service.");
        errorMessages.put(Integer.valueOf(ERROR_TRANSLATE_SERVICE_NOT_AVAILABLE), "The translation service is not available; Please try again later.");
        errorMessages.put(Integer.valueOf(ERROR_TRANSLATE_JSON_RESPONSE), "The response from the Yandex.Translate service cannot be parsed; Please try again later.");
        errorMessages.put(Integer.valueOf(ERROR_ILLEGAL_HOUR), "The hour must be set to a value between 0 and 23.");
        errorMessages.put(Integer.valueOf(ERROR_ILLEGAL_MINUTE), "The minute must be set to a value between 0 and 59.");
        errorMessages.put(Integer.valueOf(ERROR_ILLEGAL_DATE), "The date you entered is invalid.");
        errorMessages.put(Integer.valueOf(ERROR_WEBVIEW_SSL_ERROR), "SSL Connection could not complete.");
        errorMessages.put(Integer.valueOf(FUSION_TABLES_QUERY_ERROR), "Fusion tables returned an error. The query was: %s. The response was: %s");
        errorMessages.put(Integer.valueOf(ERROR_TTS_NOT_READY), "TextToSpeech is not yet ready to perform this operation");
        errorMessages.put(Integer.valueOf(ERROR_BAD_PERCENT), "Percent values should be between 0 and 100.");
        errorMessages.put(Integer.valueOf(ERROR_IMAGE_CANNOT_ROTATE), "The version of Android on this device does not support image rotation.");
        errorMessages.put(Integer.valueOf(ERROR_DIVISION_BY_ZERO), "Trying to divide %s by 0.  The result might not be valid.");
        errorMessages.put(Integer.valueOf(ERROR_EXTENSION_ERROR), "Error %d in extension %s: %s");
        errorMessages.put(Integer.valueOf(ERROR_LINESTRING_TOO_FEW_POINTS), "Need at least 2 points for a LineString. Got only %1$d.");
        errorMessages.put(Integer.valueOf(ERROR_LINESTRING_PARSE_ERROR), "Parse error attempting to create LineString: %1$s.");
        errorMessages.put(Integer.valueOf(ERROR_LINESTRING_TOO_FEW_FIELDS), "Too few fields in point. Expected 2, got %2$d.");
        errorMessages.put(Integer.valueOf(ERROR_POLYGON_PARSE_ERROR), "Parse error attempting to create Polygon: %1$s.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_POINT), "Invalid value for point (%1$s, %2$s).");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_POINT_AT_INDEX), "Invalid value for point at index %1$d (%2$s, %3$s).");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_TYPE_AT_INDEX), "Invalid type %2$s at index %1$d. Expected %3$s.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_NUMBER_OF_VALUES_IN_POINT_AT_INDEX), "Invalid number of values in point at index %1$d. Expected %2$d but found %3$d.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_NUMBER_OF_VALUES_IN_POINT), "Invalid number of values in point. Expected %1$d but found %2$d.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_TYPE), "Invalid type %1$s. Expected %2$s.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_GEOJSON), "Unable to parse GeoJSON content for the reason: %1$s.");
        errorMessages.put(Integer.valueOf(ERROR_EXCEPTION_DURING_MAP_SAVE), "Unable to save Map due to an internal exception: %1$s.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_LATITUDE), "Latitude %1$f was not in the expected range [-90, 90].");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_LONGITUDE), "Longitude %1$f was not in the expected range [-180, 180].");
        errorMessages.put(Integer.valueOf(ERROR_UNABLE_TO_CREATE_TILE_CACHE), "Unable to create a tile cache for maps.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_ANCHOR_VERTICAL), "Invalid value %1$d given for AnchorVertical. Valid settings are 1, 2, or 3.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_ANCHOR_HORIZONTAL), "Invalid value %1$d given for AnchorHorizontal. Valid settings are 1, 2, or 3.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_LATITUDE_IN_POINT_AT_INDEX), "Invalid latitude %2$s in point at index %1$d. Expected a value between [-90, 90].");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_LONGITUDE_IN_POINT_AT_INDEX), "Invalid longitude %2$s in point at index %1$d. Expected a value between [-180, 180].");
        errorMessages.put(Integer.valueOf(ERROR_EXPECTED_ARRAY_AT_INDEX), "Expected an array of values at index %1$d, but got %2$s.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_UNIT_SYSTEM), "Invalid unit system %1$d given to ScaleUnits. Expected either 1 or 2.");
        errorMessages.put(Integer.valueOf(ERROR_NO_CALL_PERMISSION), "You do not have permission to make phone calls.");
        errorMessages.put(Integer.valueOf(ERROR_UNABLE_TO_INSTALL_PACKAGE), "Unable to launch the package installer for %1$s.");
        errorMessages.put(Integer.valueOf(ERROR_INVALID_CONFIGURATION_VALUE), "Invalid value %1$d given for ARConfigurationType.  Valid settings are 1, 2, or 3.");
    }

    private ErrorMessages() {
    }

    public static String formatMessage(int errorNumber, Object[] messageArgs) {
        return String.format((String) errorMessages.get(Integer.valueOf(errorNumber)), messageArgs);
    }
}
