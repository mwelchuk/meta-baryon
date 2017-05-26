IMAGE_FEATURES = " \
                     debug-tweaks \
                     nfs-server \
                     package-management \
                     ssh-server-openssh \
                 "

inherit core-image

IMAGE_INSTALL += " \
                     e2fsprogs-mke2fs \
                     lvm2 \
                     mdadm \
                     openssh-sftp-server \
                     parted \
                     procps \
                     proftpd \
                     samba \
                     util-linux-mkfs \
                     webmin \
                     webmin-module-acl \
                     webmin-module-init \
                     webmin-module-mount \
                     webmin-module-net \
                     webmin-module-proftpd \
                     webmin-module-samba \
                     webmin-module-servers \
                     webmin-module-sshd \
                     webmin-module-status \
                     webmin-module-time \
                     webmin-module-useradmin \
                     webmin-module-webmin \
                     webmin-module-webmincron \
                     webmin-notice \
                 "

