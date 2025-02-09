SUMMARY = "phodav is a WebDav server implementation using libsoup (RFC 4918)."
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = " \
    glib-2.0 \
    libsoup \
"

GNOMEBASEBUILDCLASS = "meson"
GTKDOC_MESON_OPTION = 'gtk_doc'
GTKDOC_MESON_ENABLE_FLAG = 'enabled'
GTKDOC_MESON_DISABLE_FLAG = 'disabled'

PACKAGECONFIG ??= "avahi"
PACKAGECONFIG[avahi] = "-Davahi=enabled,-Davahi=disabled,avahi"

inherit pkgconfig gnomebase gettext gtk-doc

SRC_URI = "https://download.gnome.org/sources/phodav/3.0/phodav-${PV}.tar.xz;name=archive"
SRC_URI[archive.sha256sum] = "392ec2d06d50300dcff1ef269a2a985304e29bce3520002fca29f2edc1d138d1"

FILES:${PN} += "${libdir}"
