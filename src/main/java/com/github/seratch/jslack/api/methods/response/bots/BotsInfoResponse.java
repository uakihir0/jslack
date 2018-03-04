package com.github.seratch.jslack.api.methods.response.bots;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class BotsInfoResponse implements SlackApiResponse {

    public BotsInfoResponse() {
    }

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public Bot getBot() {
        return this.bot;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BotsInfoResponse)) return false;
        final BotsInfoResponse other = (BotsInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$bot = this.getBot();
        final Object other$bot = other.getBot();
        if (this$bot == null ? other$bot != null : !this$bot.equals(other$bot)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $bot = this.getBot();
        result = result * PRIME + ($bot == null ? 43 : $bot.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BotsInfoResponse;
    }

    public String toString() {
        return "BotsInfoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", bot=" + this.getBot() + ")";
    }

    public static class Bot {
        private String id;
        private boolean deleted;
        private String name;
        private Icons icons;

        public Bot() {
        }

        public String getId() {
            return this.id;
        }

        public boolean isDeleted() {
            return this.deleted;
        }

        public String getName() {
            return this.name;
        }

        public Icons getIcons() {
            return this.icons;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setDeleted(boolean deleted) {
            this.deleted = deleted;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIcons(Icons icons) {
            this.icons = icons;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Bot)) return false;
            final Bot other = (Bot) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            if (this.isDeleted() != other.isDeleted()) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            final Object this$icons = this.getIcons();
            final Object other$icons = other.getIcons();
            if (this$icons == null ? other$icons != null : !this$icons.equals(other$icons)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            result = result * PRIME + (this.isDeleted() ? 79 : 97);
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            final Object $icons = this.getIcons();
            result = result * PRIME + ($icons == null ? 43 : $icons.hashCode());
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Bot;
        }

        public String toString() {
            return "BotsInfoResponse.Bot(id=" + this.getId() + ", deleted=" + this.isDeleted() + ", name=" + this.getName() + ", icons=" + this.getIcons() + ")";
        }

        public static class Icons {
            private String image36;
            private String image48;
            private String image72;

            public Icons() {
            }

            public String getImage36() {
                return this.image36;
            }

            public String getImage48() {
                return this.image48;
            }

            public String getImage72() {
                return this.image72;
            }

            public void setImage36(String image36) {
                this.image36 = image36;
            }

            public void setImage48(String image48) {
                this.image48 = image48;
            }

            public void setImage72(String image72) {
                this.image72 = image72;
            }

            public boolean equals(Object o) {
                if (o == this) return true;
                if (!(o instanceof Icons)) return false;
                final Icons other = (Icons) o;
                if (!other.canEqual((Object) this)) return false;
                final Object this$image36 = this.getImage36();
                final Object other$image36 = other.getImage36();
                if (this$image36 == null ? other$image36 != null : !this$image36.equals(other$image36)) return false;
                final Object this$image48 = this.getImage48();
                final Object other$image48 = other.getImage48();
                if (this$image48 == null ? other$image48 != null : !this$image48.equals(other$image48)) return false;
                final Object this$image72 = this.getImage72();
                final Object other$image72 = other.getImage72();
                if (this$image72 == null ? other$image72 != null : !this$image72.equals(other$image72)) return false;
                return true;
            }

            public int hashCode() {
                final int PRIME = 59;
                int result = 1;
                final Object $image36 = this.getImage36();
                result = result * PRIME + ($image36 == null ? 43 : $image36.hashCode());
                final Object $image48 = this.getImage48();
                result = result * PRIME + ($image48 == null ? 43 : $image48.hashCode());
                final Object $image72 = this.getImage72();
                result = result * PRIME + ($image72 == null ? 43 : $image72.hashCode());
                return result;
            }

            protected boolean canEqual(Object other) {
                return other instanceof Icons;
            }

            public String toString() {
                return "BotsInfoResponse.Bot.Icons(image36=" + this.getImage36() + ", image48=" + this.getImage48() + ", image72=" + this.getImage72() + ")";
            }
        }
    }

    private boolean ok;
    private String warning;
    private String error;

    private Bot bot;
}