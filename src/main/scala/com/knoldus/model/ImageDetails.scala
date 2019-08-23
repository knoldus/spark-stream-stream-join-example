package com.knoldus.model

import java.sql.Timestamp
import java.util.UUID


case class ImageDetails(cameraId: String, imageId: String, imageUrl: String, timeStamp: Timestamp) {
  override def toString: String = s"""{"cameraId":"$cameraId", "imageId":"$imageId", "imageUrl":"$imageUrl", "timestamp":"$timeStamp"}"""
}


case class GpsDetails(cameraId: String, gpsId: String, lat: Double , lon: Double, timestamp: Timestamp)
