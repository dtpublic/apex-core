/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.malhartech.tuple;

import com.malhartech.bufferserver.packet.MessageType;
import com.malhartech.bufferserver.util.Codec;

/**
 *
 * Basic object that is streamed<p>
 * <br>
 * Tuples are of the following type<br>
 * Data:<br>
 * Control: begin window, end window, reset window, end stream<br>
 * heartbeat: To be done, not a high priority<br>
 * <br>
 *
 * @author chetan
 */
public class Tuple
{
  protected long windowId;
  private final MessageType type;

  public Tuple(MessageType t)
  {
    type = t;
  }

  public Tuple(MessageType t, long windowId)
  {
    type = t;
    this.windowId = windowId;
  }

  /**
   * @return the windowId
   */
  public long getWindowId()
  {
    return windowId;
  }

  /**
   * @param windowId the windowId to set
   */
  public void setWindowId(long windowId)
  {
    this.windowId = windowId;
  }

  /**
   * @return the type
   */
  public MessageType getType()
  {
    return type;
  }

  @Override
  public String toString()
  {
    return "type = " + type + " " + Codec.getStringWindowId(windowId);
  }

}