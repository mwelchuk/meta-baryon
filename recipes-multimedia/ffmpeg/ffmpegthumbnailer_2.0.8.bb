SUMMARY = "Video thumbnailer"
DESCRIPTION = "This video thumbnailer can be used to create thumbnails for your video files. The thumbnailer uses ffmpeg to decode frames from the video files, so supported videoformats depend on the configuration flags of ffmpeg."
HOMEPAGE = "http://code.google.com/p/ffmpegthumbnailer/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"
SRC_URI = "http://ffmpegthumbnailer.googlecode.com/files/${PN}-${PV}.tar.gz"

DEPENDS = "ffmpeg jpeg libpng"

SRC_URI[md5sum] = "03e081f89778cd5e4fce30b29a4630e1"
SRC_URI[sha256sum] = "2c8bbefa838d38ea42fc8ac78258cda36865d974c991624b14cffdb92a3bc68b"

PR = "r0"

inherit autotools
