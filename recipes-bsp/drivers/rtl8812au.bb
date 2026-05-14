SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1918d7d89f091725a3188ff95f7c72b"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
    git://github.com/morrownr/8812au-20210820.git;protocol=https;branch=main \
    file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

# 9704072d is the last good commit before upstream PR #62 (Apr 2026)
# introduced the same undefined _FW_UNDER_SURVEY reference seen in
# rtl8821au's PR #198. Includes upstream's kernel 6.13 / 6.14 fixes.
SRCREV = "9704072df4d75cedf8d622cf2a483aef05109e41"

PV = "5.13.6-git+2025.09"
S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
