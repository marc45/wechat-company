package cc.pp.weixin.constant;

/**
 * 微信公众平台消息中含有的字段名称
 * @author wgybzb
 * @since  2013-04-06
 */
public interface MsgType {
	/**
	 * 文本消息
	 */
	String TEXT = "text";

	/**
	 * 图片消息
	 */
	String IMAGE = "image";

	/**
	 * 地理位置消息
	 */
	String LOCATION  = "location";

	/**
	 * 消息类型，link
	 */
	String LINK = "link";

	/**
	 * 事件推送
	 */
	String EVENT = "event";
	String EVENT_SUBSCRIBE = "subscribe";//关注事件
	String EVENT_UNSUBSCRIBE = "unsubscribe";//取消关注事件

	/**
	 * 音频类型
	 */
	String VOICE = "voice";

	/**
	 * 回复文本消息
	 */
	String RESPONSE_TEXT = "text";

	/**
	 * 回复音乐消息
	 */
	String MUSIC = "music";

	/**
	 * 回复图文消息
	 */
	String NEWS = "news";
}
